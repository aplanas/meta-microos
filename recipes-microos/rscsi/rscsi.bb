SUMMARY = "Remote SCSI server"
DESCRIPTION = "The rscsi command is a remote generic SCSI transport server program. \
rscsi is a program that is run locally on the machine with SCSI \
devices, it is used by remote programs like cdrecord(1), cdda2wav(1), \
readcd(1), and sformat(1) that like to access SCSI devices through an \
interprocess communication connection via libscg.  rscsi is normally \
started up with an rexec(3) or rcmd(3) call but it may also be \
connected via an internal pipe to an ssh(1) session that was set up \
by the remote user."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "rscsi-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "3aa31b53e3bc914f7d99c26459da2f6707edf35e46deb4e40442a1acf34fe58c9e3c5f7a11b5774b3db4842a93541e6dfd4a1b7f0d75fb0575a704b3c4d93428"

RPROVIDES:${PN} += "cdrecord:/usr/sbin/rscsi config(rscsi) rscsi rscsi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdeflt.so.1.0()(64bit) libdeflt.so.1.0(SCHILY_1.0)(64bit) libscg.so.1.0()(64bit) libscg.so.1.0(SCHILY_1.0)(64bit) libschily.so.2.0()(64bit) libschily.so.2.0(SCHILY_1.0)(64bit)"

inherit rpm
