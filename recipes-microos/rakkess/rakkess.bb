SUMMARY = "Utility to show an access matrix for k8s server resources"
DESCRIPTION = "rakkess lists access rights for the current user and all server resources \
on a provided kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "rakkess-0.5.1-1.3.aarch64.rpm"
RPM_HASH = "04df77088a66565aca91b80d83adeedeebae92deee8f4cf568a746fc478ab3bfa6c4aa793963214df3024eeaeed2519b24d147f6c2a9e038b336076583a4b606"

RPROVIDES:${PN} += "rakkess rakkess(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
