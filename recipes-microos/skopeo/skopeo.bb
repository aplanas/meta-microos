SUMMARY = "Container image repository tool"
DESCRIPTION = "skopeo is a command line utility for various operations on container images and \
image repositories. skopeo is able to inspect a repository on a Docker registry \
and fetch images layers. skopeo can copy container images between various \
storage mechanisms."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "skopeo-1.11.1-1.3.aarch64.rpm"
RPM_HASH = "6c44d0c22203e5c7d5cb75750ced58f8b599447cdc0a0cbee1c1f8ca54011134e23811af003425e4542e31079d458c59db738070aa5fe51122e4e9031d52f7d0"

RPROVIDES:${PN} += "skopeo skopeo(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libcontainers-common libdevmapper.so.1.03()(64bit) libdevmapper.so.1.03(Base)(64bit) libdevmapper.so.1.03(DM_1_02_97)(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit)"

inherit rpm
