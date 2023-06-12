SUMMARY = "Log events to an array (reference)"
DESCRIPTION = "This provides a Log::Dispatch log output system that appends logged events \
to an array reference. This is probably only useful for testing the logging \
of your code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.005"

RPM_NAME = "perl-Log-Dispatch-Array-1.005-1.2.noarch.rpm"
RPM_HASH = "23bceb22a817c964e28c4969df21154000b81d8dfa649fe833d670954fdb59c7903d9c7c8a6c5cb23b87775c13c96a822fc8e1d382097340ccb39cd8d8ed56da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Log::Dispatch::Array) \
perl-Log-Dispatch-Array"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Log::Dispatch::Output) \
perl(parent)"

inherit rpm
