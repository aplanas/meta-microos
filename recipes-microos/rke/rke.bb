SUMMARY = "Rancher Kubernetes Engine"
DESCRIPTION = "RKE is a fast, versatile Kubernetes installer that you can use to install Kubernetes on your Linux hosts. \
Rancher Kubernetes Engine (RKE) is a CNCF-certified Kubernetes distribution that runs entirely within Docker containers. It works on bare-metal and virtualized servers. With RKE, the installation and operation of Kubernetes is both simplified and easily automated, and it’s entirely independent of the operating system and platform you’re running."
LICENSE = "Apache-2.0"

PV = "1.4.5"

RPM_NAME = "rke-1.4.5-1.1.aarch64.rpm"
RPM_HASH = "b193b0620fbebe417508082a6b3bcfa6379b54b124b50c27228f73af107a6e5796e42e29a53f4b17ae4b34e668ea3de82b77dd059466f598ed720e8e7981ac32"

RPROVIDES:${PN} += "rke rke(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
