const mongoose = require('mongoose');

const todoSchema = new mongoose.Schema({
    /* todoId: {
        type: String,
        required: true,
        unique: true
    }, */
    title: {
        type: String,
        required: true,
    },
    desc: {
        type: String,
        required: true,
    },
    dateCreated: {
        type: Date,
        required: true,
    },
    active: {
        type: Boolean,
        required: true,
    },
    owner: {
        type: String,
    },
});

module.exports = todoSchema;