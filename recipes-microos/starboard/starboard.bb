SUMMARY = "Kubernetes-native security toolkit"
DESCRIPTION = "Starboard integrates security tools into the Kubernetes environment, so that users can find and view the risks that relate to different resources in a Kubernetes-native way. Starboard provides custom resources definitions and a Go module to work with a range of existing security scanners, as well as a kubectl-compatible command, the Octant plugin, and the Lens extension that make security reports available through familiar Kubernetes tools."
LICENSE = "Apache-2.0"

PV = "0.15.12"

RPM_NAME = "starboard-0.15.12-1.1.aarch64.rpm"
RPM_HASH = "74ef51737b207486970c0c2c9a5b8220a2fcbb30cb24da47d10f5880bf983e43dc87a7b095cadffa8ff724868360190dd08a1b9a875aa3e0d61e9f3b17279325"

RPROVIDES:${PN} += "starboard starboard(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
