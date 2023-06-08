SUMMARY = "Yaru icon theme"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package contains the icon theme."
LICENSE = "CC-BY-SA-4.0"

PV = "20.10.6.1"

RPM_NAME = "yaru-icon-theme-20.10.6.1-1.6.noarch.rpm"
RPM_HASH = "c1eb3c00cc4a44b4509e88f0925251eb646ef05701547708db4dbd1c1fb2ae8fa5b2232db12029670ed3a94ee9e98e6ee1669e36ca411d284b879d1a86fdbf8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yaru-icon-theme"
RDEPENDS:${PN} += "hicolor-icon-theme humanity-icon-theme"

inherit rpm
