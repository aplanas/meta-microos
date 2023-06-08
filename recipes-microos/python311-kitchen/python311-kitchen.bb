SUMMARY = "Kitchen contains a cornucopia of useful code"
DESCRIPTION = "A bunch of useful python functions to be used in other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "python311-kitchen-1.2.6-4.10.noarch.rpm"
RPM_HASH = "8b3eac1c7a57b4b74bfee1046467dad669ccb39557733c34f75ff895df673c8b6baefc7a70c1727baa20a170eab541fe23d9ffcf09a6b1d42e74c34533e03501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(kitchen) python311-kitchen python3dist(kitchen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
