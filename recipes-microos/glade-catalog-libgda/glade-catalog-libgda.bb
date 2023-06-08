SUMMARY = "Glade catalog for libgda"
DESCRIPTION = "This package provides a catalog for Glade, to allow the use the libgda \
widgets in Glade."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "glade-catalog-libgda-6.0.0-6.6.aarch64.rpm"
RPM_HASH = "fa211f70ee57ff29d81a7ed5722ddb87aee48dd383bf66ee7a4f5876409bd82a09a725edf61519b76b91aa67c5b3108ca8dce4b4df615bdbeb4bebdb6cb62ee3"

RPROVIDES:${PN} += "glade-catalog-libgda glade-catalog-libgda(aarch-64)"
RDEPENDS:${PN} += "glade libgda-6_0"

inherit rpm
