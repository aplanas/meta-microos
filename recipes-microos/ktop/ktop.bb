SUMMARY = "A top-like tool for your Kubernetes clusters"
DESCRIPTION = "A top-like tool for your Kubernetes cluster. \
 \
Following the tradition of Unix/Linux top tools, ktop is a tool that displays useful metrics information about nodes, pods, and other workload resources running in a Kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "0.3.5"

RPM_NAME = "ktop-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "f10aaf23932805be6dbd613d2d1d6bea08605eb56d59b61a684a8c4db5f2ad7a66a514cbd8d3f576814e61ed0ebc8b3fc55e3a8868c6f7f28ef41f640294896d"

RPROVIDES:${PN} += "ktop ktop(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
