SUMMARY = "Nautilus overlay icons"
DESCRIPTION = "This package provides overlay icons to visualise the \
synchronisation state in the Nautilus file manager."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.1"

RPM_NAME = "nautilus-extension-nextcloud-3.8.1-1.1.noarch.rpm"
RPM_HASH = "d5f0fae142aeb766f93f0f03241d417d49392c3f429b943bd2f6940d9230f93d4ec0fdc0c09a241656b52ba3e38e6b5b806e3fedb88f1d61d2b606f22505feb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-nextcloud"
RDEPENDS:${PN} += "nautilus nextcloud-desktop python3-nautilus typelib(GObject) typelib(Nautilus)"

inherit rpm
