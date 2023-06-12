SUMMARY = "Various portability utilities for module builders"
DESCRIPTION = "This module provides various portable helper functions for module building \
modules."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.026"

RPM_NAME = "perl-ExtUtils-Helpers-0.026-1.23.noarch.rpm"
RPM_HASH = "7a6862d7022ec82b23d81b9291070c6a1991bb67b4f2c5cce329decce05f55161d5e6bd0e7a26c639365eed9eded9a24bf4a58d7c36eb0b5e404cd1021df8f83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(ExtUtils::Helpers) \
perl(ExtUtils::Helpers::Unix) \
perl(ExtUtils::Helpers::VMS) \
perl(ExtUtils::Helpers::Windows) \
perl-ExtUtils-Helpers"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
