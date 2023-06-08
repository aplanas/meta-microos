SUMMARY = "16 stemmer algorithms"
DESCRIPTION = "This package provides 16 stemmer algorithms (15 + Poerter English \
stemmer) generated from Snowball algorithms.  It includes following \
language algorithms: Danish, Dutch, English (Standard, Porter), \
Finnish, French, German, Hungarian, Italian, Norwegian, Portuguese, \
Romanian, Russian, Spanish, Swedish, Turkish. This is a pure Python \
stemming library. If PyStemmer is available, this module uses it to \
accelerate."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-snowballstemmer-2.2.0-2.1.noarch.rpm"
RPM_HASH = "3641f5af9bc84d8a7692f3dc0f42f853edae361a0120e38a1c1d7057472854a3b0eb092ca3672b0dcaabfc238ca100669603ef86a04447dd6da3ab9dd80d5c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(snowballstemmer) python311-snowballstemmer python3dist(snowballstemmer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
