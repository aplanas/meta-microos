SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683294886.8a7e554"

RPM_NAME = "openQA-auto-update-4.6.1683294886.8a7e554-1.1.aarch64.rpm"
RPM_HASH = "19f346d99bbce743b14c1776efc8f253258490acd5b0099284736f1b937b6626ebfd68f1a6b62c0fd9f141e48e43f881f009ce1a773e0115f67021fdd968cf48"

RPROVIDES:${PN} += "openQA-auto-update openQA-auto-update(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh curl openQA-common rebootmgr"

inherit rpm
