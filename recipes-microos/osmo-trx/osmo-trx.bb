SUMMARY = "SDR transceiver that implements Layer 1 of a GSM BTS"
DESCRIPTION = "OsmoTRX is a software-defined radio transceiver that implements the Layer 1 \
physical layer of a BTS comprising the following 3GPP specifications: \
 \
TS 05.01 'Physical layer on the radio path' \
TS 05.02 'Multiplexing and Multiple Access on the Radio Path' \
TS 05.04 'Modulation' \
TS 05.10 'Radio subsystem synchronization' \
 \
In this context, BTS is 'Base transceiver station'. It's the stations that \
connect mobile phones to the mobile network. \
 \
3GPP is the '3rd Generation Partnership Project' which is the collaboration \
between different telecommunication associations for developing new \
generations of mobile phone networks. (post-2G/GSM)"
LICENSE = "AGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-trx-1.4.0-1.14.aarch64.rpm"
RPM_HASH = "b7a722cd84dacc49ab25075857873f34e037813724be4b468c60627b94790fbdb77092b6d4aa72bafa1636d1ab27d47586bd41819e10ad87ef082648a45fa443"

RPROVIDES:${PN} += "osmo-trx osmo-trx(aarch-64)"
RDEPENDS:${PN} += "systemd"

inherit rpm
