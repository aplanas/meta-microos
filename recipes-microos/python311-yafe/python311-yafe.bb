SUMMARY = "Yet Another Framework for Experiments"
DESCRIPTION = "The package yafe offers a generic framework to conduct \
scientific experiments."
LICENSE = "GPL-3.0-only"

PV = "1.0.3"

RPM_NAME = "python311-yafe-1.0.3-2.8.noarch.rpm"
RPM_HASH = "4b4b5a3b17a324bbd8da08176caa6ea16a65f4707a46fda8cf4d9fdb7414d460d8831960fb3c573950029eab4c3db8735ae48c0467f7b88d281da9820992059b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yafe) \
python311-yafe \
python3dist(yafe)"
RDEPENDS:${PN} += "python(abi) \
python311-numpy"

inherit rpm
