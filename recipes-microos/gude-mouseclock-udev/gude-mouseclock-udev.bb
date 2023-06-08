SUMMARY = "Udev rules for GUDE DCF77 receivers"
DESCRIPTION = "Udev rules for GUDE DCF77 receivers. \
 \
* creates the symlink for /dev/refclock-0 to the TTY your DCF receiver \
  is connected to. \
* set group permission to 'ntp' for your DCF receiver's TTY to give \
  ntpd access to your device. \
 \
Supported devices \
 * GUDE Expert mouseCLOCK USB II \
 \
NOTE: You still have to manually adjust ntpd's AppArmor profile to give ntpd \
access to your DCF receiver's serial port (/etc/apparmor.d/tunables/ntpd)"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "gude-mouseclock-udev-0.1-1.7.noarch.rpm"
RPM_HASH = "a01b8313d0c58909a027473d61647ba134c13365ebb21c5d956d45fca213675dff0dbe5cb0e45ea1f10827afa7d6843a3c27ff6c88644317d7fa1cb2305cb72a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gude-mouseclock-udev"
RDEPENDS:${PN} += "/bin/sh systemd user(ntp)"

inherit rpm
