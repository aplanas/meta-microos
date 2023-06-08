SUMMARY = "PC/SC IFD Handler for the ACR38 Smart Card Reader"
DESCRIPTION = "This package contains a driver for the ACR 38 smart card reader \
produced by ACS. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "GPL-2.0+"

PV = "1.7.11"

RPM_NAME = "pcsc-acr38-devel-1.7.11-7.25.aarch64.rpm"
RPM_HASH = "4553d25fad7f9024ea8adcc99b72f68419a28a0c3fb6ad043610463994a9d8eaaabd8fd5586b2eae8a6856ace44a8c2b00b4d7512cd1e17dc50d40444b5ad3a9"

RPROVIDES:${PN} += "pcsc-acr38-devel pcsc-acr38-devel(aarch-64) pkgconfig(libacr38ucontrol)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libacr38ucontrol0 pcsc-lite-devel"

inherit rpm
