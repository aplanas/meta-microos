SUMMARY = "GStreamer documentation"
DESCRIPTION = "GStreamer documentation."
LICENSE = "(BSD-2-Clause | LGPL-2.1-or-later | MIT) & OPL-1.0 & CC-BY-SA-4.0"

PV = "1.22.1"

RPM_NAME = "gstreamer-docs-1.22.1-1.1.noarch.rpm"
RPM_HASH = "757c13ce96749ccd423830a1ee60da6b47d030f1d54af466a46f65185246806556c279062676e15f90930930b1f8bce0318837b9904658a19c29910b858fc3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gstreamer-doc gstreamer-docs gstreamer-plugins-bad-doc gstreamer-plugins-base-doc gstreamer-plugins-good-doc gstreamer-plugins-libav-doc gstreamer-plugins-ugly-doc gstreamer-plugins-vaapi-doc"
RDEPENDS:${PN} += ""

inherit rpm
