SUMMARY = "Documentation for gnulib modules"
DESCRIPTION = "The GNU portability library is a macro system and C declarations and \
definitions for commonly-used API elements and abstracted system behaviors. \
It can be used to improve portability and other functionality in your programs. \
 \
This package contains documentation for gnulib."
LICENSE = "GFDL-1.3-only"

PV = "git.20211127.db493d1ce"

RPM_NAME = "gnulib-docs-git.20211127.db493d1ce-2.6.noarch.rpm"
RPM_HASH = "86e16695faf56c75e07b50b1b4a398ac3d7a8cb267c8b9d14c7e0a30e1fcbf74ad6f67e04673cfdf7bcfd9a3f711855aa1e5017389173c2ca2abcaff0e42f236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnulib-docs"
RDEPENDS:${PN} += "/bin/sh \
gnulib-devel \
info"

inherit rpm
