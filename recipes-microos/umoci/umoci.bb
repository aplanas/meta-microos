SUMMARY = "Open Container Image manipulation tool"
DESCRIPTION = "umoci modifies Open Container images. umoci is a manipulation tool for OCI \
images. In particular, it is a more complete alternative to oci-image-tools \
provided by the OCI."
LICENSE = "Apache-2.0"

PV = "0.4.7"

RPM_NAME = "umoci-0.4.7-3.2.aarch64.rpm"
RPM_HASH = "57ff8d28701a868e1a24a14329dc585bf4b93967fa53f32039f9e1097c7883749e328efd968c1681e52995519fa19db1dfd9fa5c20397d736aa6daf3f551603f"

RPROVIDES:${PN} += "umoci umoci(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
