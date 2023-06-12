SUMMARY = "Jalali datetime binding for python"
DESCRIPTION = "jdatetime is the Jalali implementation of Python's datetime module."
LICENSE = "Python-2.0"

PV = "4.1.0"

RPM_NAME = "python311-jdatetime-4.1.0-1.4.noarch.rpm"
RPM_HASH = "6c2aa9815fc3f286d52feafe57d3fa910ac02230edf15d814bbd56285eeb6dfff1925d630e3f499dfc890836f84183fa53e239042c65a58ce337787e894ab8ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jdatetime) \
python311-jdatetime \
python3dist(jdatetime)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
