SUMMARY = "Pure Java implementation of Xgboost predictor for online prediction tasks"
DESCRIPTION = "Pure Java implementation of XGBoost predictor for online prediction tasks."
LICENSE = "Apache-2.0"

PV = "0.3.3"

RPM_NAME = "xgboost-predictor-0.3.3-1.18.noarch.rpm"
RPM_HASH = "040e39ef1acb116b6c858b5df7bafbe1496a8fdc4ca0faa91fc62a3f6013a76b439e6df89f5a711c2d14ebe8bd6aabcb238873cc6d1f979e3c5f86cf6ca6b1a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(ai.h2o:xgboost-predictor) \
mvn(ai.h2o:xgboost-predictor:pom:) \
mvn(biz.k11i:xgboost-predictor) \
mvn(biz.k11i:xgboost-predictor:pom:) \
xgboost-predictor"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(net.jafama:jafama)"

inherit rpm
