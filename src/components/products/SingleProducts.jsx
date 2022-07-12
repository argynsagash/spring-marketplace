import { Box, Stack, Typography } from "@mui/material";

import ShareIcon from "@mui/icons-material/Share";
import { IconButton } from "@mui/material";

import Button from "@mui/material/Button";
import useDialogModal from "../../hooks/useDialogModal";
import ProductDetail from "../productDetail/ProductDetail";

import useCart from "../../hooks/useCart";
import useFavourite from "../../hooks/useFavourite";

const SingleProduct = ({ product }) => {
  const [
    ProductDetailDialog,
    showProductDetailDialog,
    closeProductDetailDialog,
  ] = useDialogModal(ProductDetail);

  const { addToCart, addToCartText } = useCart(product);
  const { addToFavourite, addToFavouriteStatus } = useFavourite(product);
  return (
    <>
      <Box
        disaply="flex"
        flexDirection={"column"}
        justifyContent="center"
        alignItems={"center"}
      >
        <img src={`${product.image}`} alt="Product" width="300px" />
        <Typography color="#ffffff" variant="h5">
          {product.name}
        </Typography>
        <Typography color="#ffffff">{`${product.price} KZT`}</Typography>

        <Stack
          direction="row"
          justifyContent="center"
          alignItems={"center"}
          color="white"
        >
          <IconButton color="inherit" onClick={addToFavourite}>
            {addToFavouriteStatus}
          </IconButton>
          <IconButton color="inherit">
            <ShareIcon />
          </IconButton>
        </Stack>

        <Stack direction="column" gap="5px">
          <Button
            variant="contained"
            color="success"
            width="300px"
            onClick={() => showProductDetailDialog()}
          >
            Подробнее
          </Button>
          <Button
            variant="contained"
            color="success"
            width="300px"
            onClick={addToCart}
          >
            {addToCartText}
          </Button>
        </Stack>
        <ProductDetailDialog product={product} />
      </Box>
    </>
  );
};

export default SingleProduct;