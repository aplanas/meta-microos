SUMMARY = "Loadkit allows you to load arbitrary files within the Lua package path"
DESCRIPTION = "Loadkit lets you register new file extension handlers that \
can be opened with require, or you can just search for files \
of any extension using the current search path."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "lua51-loadkit-1.1.0-4.2.noarch.rpm"
RPM_HASH = "db3f983f3b97e1c17991cd1e1401b0f91926f7e5530a6f9310f02799e21554fa8d54c72973961ac6d221b22160fadeafa575908540410bb00a7b39ea8cb486e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-loadkit"
RDEPENDS:${PN} += "lua51"

inherit rpm
