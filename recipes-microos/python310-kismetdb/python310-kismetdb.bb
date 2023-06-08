SUMMARY = "A python wrapper for the Kismet database"
DESCRIPTION = "Kismet database wrapper."
LICENSE = "GPL-2.0-only"

PV = "2019.05.05"

RPM_NAME = "python310-kismetdb-2019.05.05-2.13.noarch.rpm"
RPM_HASH = "58ccfe4a3bf15f6c3fdcda133130302ab8ae9a089eed17d39528672194d6cab163f0590aaead111db0d451de509271ba9d987179c8490ebec8b6856ad8985a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kismetdb python3.10dist(kismetdb) python310-kismetdb python3dist(kismetdb)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-python-dateutil python310-simplekml update-alternatives"

inherit rpm
