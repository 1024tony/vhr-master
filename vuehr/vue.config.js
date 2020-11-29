let proxyObj = {};

proxyObj['/vhr'] = {
    ws: false,
    target: 'http://localhost:8090', //代理转发地址
    changeOrigin: true,
    pathRewrite: {
        '^/': ''
    }
};

module.exports = {
    devServer: {
        host: 'localhost',
        port: 8082,
        proxy: proxyObj
    }
};