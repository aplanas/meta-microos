SUMMARY = "Jupyter widgets based on vuetify UI components - nbextension"
DESCRIPTION = "Jupyter widgets based on vuetify UI components \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.8.10"

RPM_NAME = "jupyter-ipyvuetify-nbextension-1.8.10-2.1.noarch.rpm"
RPM_HASH = "aac4a50ae83a91ff365d9faa0ee180cc4dc2ba12b0e9727ab3f9509b495d5916ccf88e2379c0f1bcee2742f2ff9d5abe7db12587259c06eb09d0f794fd73a5e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvuetify-nbextension"
RDEPENDS:${PN} += "jupyter-notebook python3dist(ipyvuetify)"

inherit rpm
