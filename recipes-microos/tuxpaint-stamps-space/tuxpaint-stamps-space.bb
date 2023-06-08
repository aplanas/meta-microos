SUMMARY = "Space stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-space package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-space-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "09f08a07f9cc31a0e3d659260b503e1dfbe12eee800ed8043b59e21d872be1303c84f6d090a3dbc99b30d7adacb2022f04c314f84b300919eb17058cb642517f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category tuxpaint-stamps-space"
RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
