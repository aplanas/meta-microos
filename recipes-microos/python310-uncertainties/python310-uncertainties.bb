SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "python310-uncertainties-3.1.7-1.4.noarch.rpm"
RPM_HASH = "bab0c913092777de31a7b56b0591014688829d4034d891faeca04404c4beb8c7b5742f5abe86a3fc55c1246754c9191bb35021d28651ffcbb2765042bcb8033a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uncertainties \
python3.10dist(uncertainties) \
python310-uncertainties \
python3dist(uncertainties)"
RDEPENDS:${PN} += "python(abi) \
python310-future"

inherit rpm
