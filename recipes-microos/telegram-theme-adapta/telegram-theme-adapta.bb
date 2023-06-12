SUMMARY = "Adapta Telegram themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains Telegram themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "telegram-theme-adapta-3.95.0.11-3.5.aarch64.rpm"
RPM_HASH = "e1e32dac25ff994ac82385a622409d6ff8e0483b9267859a85b68f7cb2f00b99421336bf13e716b553144cd2191f46b9e32581e4ce19c95821ef2fda6ff395d5"

RPROVIDES:${PN} += "telegram-theme-adapta \
telegram-theme-adapta(aarch-64)"
RDEPENDS:${PN} += "metatheme-adapta-common \
telegram-desktop"

inherit rpm
