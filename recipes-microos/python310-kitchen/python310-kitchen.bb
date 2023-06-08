SUMMARY = "Kitchen contains a cornucopia of useful code"
DESCRIPTION = "A bunch of useful python functions to be used in other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "python310-kitchen-1.2.6-4.10.noarch.rpm"
RPM_HASH = "c3bd7340e211ebc5cd3ed0d8fe23874acf618d6eebf6f6be452cf8f6efa5a55a14d381c8a1b53e57d3b7f109fe672f40ade413f178e5e252d077d7b05ee34ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kitchen python3.10dist(kitchen) python310-kitchen python3dist(kitchen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
