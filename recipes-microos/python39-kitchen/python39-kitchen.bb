SUMMARY = "Kitchen contains a cornucopia of useful code"
DESCRIPTION = "A bunch of useful python functions to be used in other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "python39-kitchen-1.2.6-4.10.noarch.rpm"
RPM_HASH = "60a0c7c99ed2196c17d04f879316605a1e936f8cc277ad0a9686e45b68328943df8dd260529c33577f3ef92bb89af40a680a138ad51f85925ef4c3688a4f4beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(kitchen) python39-kitchen python3dist(kitchen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
