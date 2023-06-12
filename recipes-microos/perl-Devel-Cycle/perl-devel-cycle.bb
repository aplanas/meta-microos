SUMMARY = "Find memory cycles in objects"
DESCRIPTION = "This is a simple developer's tool for finding circular references in \
objects and other types of references. Because of Perl's reference-count \
based memory management, circular references will cause memory leaks."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.12"

RPM_NAME = "perl-Devel-Cycle-1.12-1.26.noarch.rpm"
RPM_HASH = "e97e33f3891e7e6985c345ce69f6caf3523b218f37bf75209857e0f51300d925b0b2c49fa9040eaaed4576022e88066a99edb1d86fb32f1af6c1ff6b6852080b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::Cycle) \
perl-Devel-Cycle"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
