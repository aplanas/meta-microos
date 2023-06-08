SUMMARY = "A vulnerability scanner for container images and filesystems"
DESCRIPTION = "A vulnerability scanner for container images and filesystems. Easily install the binary to try it out. Works with Syft, the powerful SBOM (software bill of materials) tool for container images and filesystems."
LICENSE = "Apache-2.0"

PV = "0.61.1"

RPM_NAME = "grype-0.61.1-1.1.aarch64.rpm"
RPM_HASH = "995f77dc0c97e50f96e3144d2f67c97ee7d8df6405c13881fd9b0b159d0086212410a2fd2d3c3646d97ad7875ba0d6f48e1bfd7aa5aeab8db02413be1fbe950f"

RPROVIDES:${PN} += "grype grype(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
