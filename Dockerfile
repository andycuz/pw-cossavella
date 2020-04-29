FROM airhacks/glassfish
COPY ./target/pw-cossavella.war ${DEPLOYMENT_DIR}
