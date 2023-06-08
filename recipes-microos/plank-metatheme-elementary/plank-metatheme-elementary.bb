SUMMARY = "GTK+ support for the Elementary Plank theme"
DESCRIPTION = "This package provides the elementary GTK+ theme for Plank."
LICENSE = "GPL-3.0-only"

PV = "5.3.0"

RPM_NAME = "plank-metatheme-elementary-5.3.0-1.10.noarch.rpm"
RPM_HASH = "f2291828a3485f1ec84708c98351ef73c0fbc00aec72c4bd78e894b9c07940f890528ae633733461cb63a149a07d4f608aa6ffc59893f4d8d12c71b9a00c961b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plank-metatheme-elementary"
RDEPENDS:${PN} += "metatheme-elementary-common plank-theme-elementary"

inherit rpm
