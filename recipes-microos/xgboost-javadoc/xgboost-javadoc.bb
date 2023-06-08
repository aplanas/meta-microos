SUMMARY = "Javadoc for xgboost"
DESCRIPTION = "Javadoc for xgboost"
LICENSE = "Apache-2.0"

PV = "0.90"

RPM_NAME = "xgboost-javadoc-0.90-3.3.noarch.rpm"
RPM_HASH = "8fae9ecf4a7c7642ac4fffd020e1f2fe8882bb0d3275aff5c4ce09764ab164bcea250f6ca75f5da7c06931e26539e1e3220a4bc1bc2384bf7dd9926b6049e307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xgboost-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
