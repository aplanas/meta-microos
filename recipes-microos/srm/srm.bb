SUMMARY = "A secure replacement for rm"
DESCRIPTION = "Unlike the standard rm, srm overwrites the data in the target files before unlinking them. This prevents command-line recovery of the data by examining the raw block device. It may also help frustrate physical examination of the disk, although it's unlikely that it can completely prevent that type of recovery. It is, essentially, a paper shredder for sensitive files. \
 \
srm is ideal for personal computers or workstations with Internet connections. It can help prevent malicious users from breaking in and undeleting personal files, such as old emails. It's also useful for permanently removing files from expensive media. For example, cleaning your diary off the zip disk you're using to send vacation pictures to Uncle Lou. Because it uses the exact same options as rm(1), srm is simple to use. Just subsitute it for rm whenever you want to destroy files, rather than just unlinking them."
LICENSE = "SGI-B-2.0"

PV = "1.2.15"

RPM_NAME = "srm-1.2.15-3.2.aarch64.rpm"
RPM_HASH = "74b1959ec1f5b8014e1326f8403cf935f516ef4bb99e7e676075465c992d0a892a48f99c9c6a94dd4fa9cbcfbe9db43b51bc0b1e902462da08282466ed7b02cf"

RPROVIDES:${PN} += "srm \
srm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
