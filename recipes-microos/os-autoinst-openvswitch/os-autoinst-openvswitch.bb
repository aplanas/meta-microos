SUMMARY = "Openvswitch support for os-autoinst"
DESCRIPTION = "This package contains openvswitch support for os-autoinst."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683277334.0688448"

RPM_NAME = "os-autoinst-openvswitch-4.6.1683277334.0688448-1.1.aarch64.rpm"
RPM_HASH = "8dd624a7ef7c918e26213101cd606f35382ad5d523640e8d64721105fdaac3bc9e98ab723c2e17e667a7f85620d6e98bb13efc83b9215a06e6d9127f8cd63b0d"

RPROVIDES:${PN} += "config(os-autoinst-openvswitch) os-autoinst-openvswitch os-autoinst-openvswitch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl openvswitch openvswitch-switch os-autoinst"

inherit rpm
