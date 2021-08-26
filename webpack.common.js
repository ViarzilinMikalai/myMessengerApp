const path = require('path');
const VueLoaderPlugin = require('vue-loader/lib/plugin');

module.exports = {

    entry: path.join(__dirname, 'src', 'main', 'resources', 'js', 'main.js'),

    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /(node_modules|bower_components)/,
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: ['@babel/preset-env']
                    }
                }
            },
            {
                test: /\.vue$/,
                loader: 'vue-loader'
            },
            {
                test: /\.css$/,
                use: [
                    'vue-style-loader',
                    {
                        loader: 'css-loader',
                        options: {
                            // css-loader set esModule: true as the default in v4.0.0
                            // https://github.com/webpack-contrib/css-loader/releases/tag/v4.0.0
                            // Doesn't work unless this disabled
                            // esModule: false
                        }
                    },
                ]
            }
        ]
    },
    plugins: [
        new VueLoaderPlugin()
    ],
    resolve: {
        modules: [
            path.join(__dirname, 'src', 'main', 'resources', 'js'),
            path.join(__dirname, 'node_modules'),
        ],
    }
}