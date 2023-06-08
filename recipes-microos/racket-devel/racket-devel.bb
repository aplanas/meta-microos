SUMMARY = "Development header files for Racket"
DESCRIPTION = "This package contains the symlinks, headers and object files needed to \
compile and link programs which use Racket."
LICENSE = "Apache-2.0 | MIT"

PV = "8.8"

RPM_NAME = "racket-devel-8.8-1.3.aarch64.rpm"
RPM_HASH = "6c7ef29458e19c945ab8cc1c8ee7981dee5ea8a5ba42b9f7c1d3a2536bc6de1b2f4c7766be2426cde415daefc2df61455ebd8aa96205c9e91d30731ed5aaf424"

RPROVIDES:${PN} += "racket-devel racket-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libffi-devel racket"

inherit rpm
