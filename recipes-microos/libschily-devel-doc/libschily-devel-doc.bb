SUMMARY = "Manual pages for libschily functions"
DESCRIPTION = "libschily contains many portability functions used by the Schily \
tools. \
 \
This subpackage contains manual pages for the APIs exposed by libschily."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "libschily-devel-doc-2022.10.16-47.3.noarch.rpm"
RPM_HASH = "9026a43ea3f110c7f96fa879c55908ec2363a7de5dfc7fdaf1098ae40ced4b351e8d75e3eb539117f0650d35cc3cbdb531fca177863517b133fc4a2c3740ef0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libschily-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
