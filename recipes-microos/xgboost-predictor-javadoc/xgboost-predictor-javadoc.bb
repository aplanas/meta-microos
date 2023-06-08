SUMMARY = "Javadoc for xgboost-predictor"
DESCRIPTION = "Javadoc for xgboost-predictor"
LICENSE = "Apache-2.0"

PV = "0.3.3"

RPM_NAME = "xgboost-predictor-javadoc-0.3.3-1.18.noarch.rpm"
RPM_HASH = "50929c38e18ac0d3c313a7bd84861b92a7b0943f9d83c0edbeaf871dc2295e69258ec973c1f9036453cf556e6240d60a23fc8bb50c5f0dfb486fa630950817e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xgboost-predictor-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
