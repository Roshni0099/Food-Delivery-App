import axios from "axios";

const API_URL = 'http://localhost:9000/api/foods';
export const addFood = async (foodData, image) => {
    const formdata = new FormData();
    formdata.append('food', JSON.stringify(foodData));
    formdata.append('file', image);

    try {
        const response = await axios.post(API_URL, formdata, { headers: { "Content-Type": "multipart/form-date" } });
    }
    catch (error) {
        console.log('Error', error);
        throw error;
    }

}