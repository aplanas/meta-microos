SUMMARY = "Example Scripts for mpibash"
DESCRIPTION = "MPI-Bash makes it possible to parallelize Bash scripts which run a set of \
Linux commands independently over a large number of input files. \
 \
This package contains example scripts for mpibash."
LICENSE = "GPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "mpibash-examples-1.3-3.8.aarch64.rpm"
RPM_HASH = "021714f9fcae0f78eb9fe55900c6d2f5cb06495fa609016e97c180ffe4f13edfb170e17d5cc1cb07a95204a3012cbc7e9287b2ce3e55070d8cde399232f1ce94"

RPROVIDES:${PN} += "mpibash-examples mpibash-examples(aarch-64)"
RDEPENDS:${PN} += "mpibash"

inherit rpm
