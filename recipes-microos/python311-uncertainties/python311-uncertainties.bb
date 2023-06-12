SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "python311-uncertainties-3.1.7-1.4.noarch.rpm"
RPM_HASH = "193fc592a359a41a4695133c1a695bb8f1056fb23d030aac4d1fd0a5196b46ad24eaa963af3c98d928bb541749c99a6326e82e543e0fe80ee2fc16e533f6f6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(uncertainties) \
python311-uncertainties \
python3dist(uncertainties)"
RDEPENDS:${PN} += "python(abi) \
python311-future"

inherit rpm
