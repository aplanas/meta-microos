SUMMARY = "LSB Fake Package"
DESCRIPTION = "Necessary files and dependencies for the Linux Standard Base (LSB) \
Core."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.fake"

RPM_NAME = "lsb-4.0.fake-3.6.aarch64.rpm"
RPM_HASH = "dae1c427629ec0234108bae92947d45cf9ca29ce8753bfe9ceb29c5161ab831e5af1cda845a16c73b15409fea767245a811201809f9df23baf90de332076cc85"

RPROVIDES:${PN} += "lsb lsb(aarch-64) lsb-core-aarch64 lsb-core-noarch lsb-graphics-aarch64 lsb-graphics-noarch"
RDEPENDS:${PN} += "/usr/bin/ar /usr/bin/at /usr/bin/awk /usr/bin/basename /usr/bin/batch /usr/bin/bc /usr/bin/cat /usr/bin/chfn /usr/bin/chgrp /usr/bin/chmod /usr/bin/chown /usr/bin/chsh /usr/bin/cksum /usr/bin/cmp /usr/bin/col /usr/bin/comm /usr/bin/cp /usr/bin/crontab /usr/bin/csplit /usr/bin/cut /usr/bin/dd /usr/bin/df /usr/bin/diff /usr/bin/dirname /usr/bin/du /usr/bin/echo /usr/bin/ed /usr/bin/env /usr/bin/expand /usr/bin/expr /usr/bin/false /usr/bin/file /usr/bin/find /usr/bin/fold /usr/bin/foomatic-rip /usr/bin/fuser /usr/bin/gencat /usr/bin/getconf /usr/bin/gettext /usr/bin/groups /usr/bin/gs /usr/bin/head /usr/bin/hostname /usr/bin/iconv /usr/bin/id /usr/bin/install /usr/bin/ipcrm /usr/bin/ipcs /usr/bin/join /usr/bin/kill /usr/bin/killall /usr/bin/ln /usr/bin/locale /usr/bin/localedef /usr/bin/logger /usr/bin/logname /usr/bin/lp /usr/bin/lpr /usr/bin/ls /usr/bin/m4 /usr/bin/mailx /usr/bin/make /usr/bin/man /usr/bin/md5sum /usr/bin/mkdir /usr/bin/mkfifo /usr/bin/mknod /usr/bin/more /usr/bin/mount /usr/bin/msgfmt /usr/bin/mv /usr/bin/newgrp /usr/bin/nice /usr/bin/nl /usr/bin/nohup /usr/bin/od /usr/bin/passwd /usr/bin/paste /usr/bin/patch /usr/bin/pathchk /usr/bin/pidof /usr/bin/pr /usr/bin/printf /usr/bin/ps /usr/bin/pwd /usr/bin/renice /usr/bin/rm /usr/bin/rmdir /usr/bin/rsync /usr/bin/sed /usr/bin/sh /usr/bin/sleep /usr/bin/sort /usr/bin/split /usr/bin/strip /usr/bin/stty /usr/bin/su /usr/bin/sum /usr/bin/sync /usr/bin/tail /usr/bin/tar /usr/bin/tee /usr/bin/test /usr/bin/time /usr/bin/touch /usr/bin/tr /usr/bin/true /usr/bin/tsort /usr/bin/tty /usr/bin/umount /usr/bin/uname /usr/bin/unexpand /usr/bin/uniq /usr/bin/wc /usr/bin/xargs /usr/bin/xdg-desktop-icon /usr/bin/xdg-desktop-menu /usr/bin/xdg-email /usr/bin/xdg-icon-resource /usr/bin/xdg-mime /usr/bin/xdg-open /usr/bin/xdg-screensaver /usr/sbin/groupadd /usr/sbin/groupdel /usr/sbin/groupmod /usr/sbin/sendmail /usr/sbin/shutdown /usr/sbin/useradd /usr/sbin/userdel /usr/sbin/usermod Mesa cpio grep gzip lsb-release pax perl-base python"

inherit rpm
