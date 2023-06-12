SUMMARY = "Digital Forensics Virtual File System"
DESCRIPTION = "dfVFS, or Digital Forensics Virtual File System, provides read-only \
access to file-system objects from various storage media types and file \
formats. The goal of dfVFS is to provide a generic interface for \
accessing file-system objects, for which it uses several back-ends that \
provide the actual implementation of the various storage media types, \
volume systems and file systems. \
 \
dfVFS originates from the Plaso project and is also based on ideas from \
the GRR project. It was largely rewritten and made into a stand-alone \
project to provide more flexibility and allow other projects to make use \
of the VFS functionality. dfVFS originally was named PyVFS, but that \
name conflicted with another project. \
 \
dfVFS is currently implemented as a Python module."
LICENSE = "Apache-2.0"

PV = "0~20221224"

RPM_NAME = "python311-dfVFS-0~20221224-2.1.noarch.rpm"
RPM_HASH = "15d44af030da347a4d2de2bcc85407a3d63d96d3ac09fad4743883f8a76fe52bfd94987dbff9e7eca1cc7a0f34cdd3cd1884b3a68161ab1023608dfb97120742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dfvfs) \
python311-dfVFS \
python3dist(dfvfs)"
RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-construct \
python311-cryptography \
python311-dfdatetime \
python311-dtfabric \
python311-libbde \
python311-libcaes \
python311-libewf \
python311-libfsapfs \
python311-libfsext \
python311-libfsfat \
python311-libfshfs \
python311-libfsntfs \
python311-libfsxfs \
python311-libfvde \
python311-libfwnt \
python311-libluksde \
python311-libmodi \
python311-libphdi \
python311-libqcow \
python311-libsigscan \
python311-libsmdev \
python311-libsmraw \
python311-libvhdi \
python311-libvmdk \
python311-libvsgpt \
python311-libvshadow \
python311-libvslvm \
python311-tsk"

inherit rpm
