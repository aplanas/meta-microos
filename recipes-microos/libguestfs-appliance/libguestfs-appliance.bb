SUMMARY = "Virtual machine needed for libguestfs"
DESCRIPTION = "libguestfs-appliance provides the appliance used by libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-appliance-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "25714971ffa32f8e3e80e954bcc636fe177a65b461367c762d875ced139fe82455363496249a4e9f61b8caab896b0d89d16d170a69cc40ff7d3ee301dadaa829"

RPROVIDES:${PN} += "guestfs-data libguestfs-appliance libguestfs-appliance(aarch-64)"
RDEPENDS:${PN} += "augeas augeas-lenses libaugeas0 libcap2 libguestfs0 libhivex0 libpcre1 qemu-tools"

inherit rpm
