FROM nginx:alpine

# copy nginx global configuration
COPY ./config/nginx.conf /etc/nginx/nginx.conf

# copy default site configuration
COPY ./config/default.conf /etc/nginx/conf.d/default.conf
