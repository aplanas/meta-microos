SUMMARY = "OpenCASCADE data exchange libraries"
DESCRIPTION = "This package contains the OpenCASCADE libraries from the \
OpenCASCADE data exchange module: \
  TKVCAF TKXSBase TKSTEPBase TKSTEPAttr TKSTEP209 TKSTEP \
  TKIGES TKXCAF TKXDEIGES TKXDESTEP TKSTL TKVRML TKXmlXCAF \
  TKBinXCAF TKRWMesh"
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "libopencascade-dataexchange7_7-7.7.0-1.3.aarch64.rpm"
RPM_HASH = "a9decd45fc541aa91123822d795753340cadea6f0a8e8ffb9d4350667a0ca94b5c8081d7d0c14b141595bd2967017411f2f7642a311d8435ca5cd7ec5311a38a"

RPROVIDES:${PN} += "libTKBinXCAF.so.7.7()(64bit) \
libTKExpress.so.7.7()(64bit) \
libTKIGES.so.7.7()(64bit) \
libTKRWMesh.so.7.7()(64bit) \
libTKSTEP.so.7.7()(64bit) \
libTKSTEP209.so.7.7()(64bit) \
libTKSTEPAttr.so.7.7()(64bit) \
libTKSTEPBase.so.7.7()(64bit) \
libTKSTL.so.7.7()(64bit) \
libTKVRML.so.7.7()(64bit) \
libTKXCAF.so.7.7()(64bit) \
libTKXDE.so.7.7()(64bit) \
libTKXDECascade.so.7.7()(64bit) \
libTKXDEIGES.so.7.7()(64bit) \
libTKXDESTEP.so.7.7()(64bit) \
libTKXSBase.so.7.7()(64bit) \
libTKXmlXCAF.so.7.7()(64bit) \
libopencascade-dataexchange7_7 \
libopencascade-dataexchange7_7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libTKBRep.so.7.7()(64bit) \
libTKBin.so.7.7()(64bit) \
libTKBinL.so.7.7()(64bit) \
libTKBinTObj.so.7.7()(64bit) \
libTKBool.so.7.7()(64bit) \
libTKCAF.so.7.7()(64bit) \
libTKCDF.so.7.7()(64bit) \
libTKG2d.so.7.7()(64bit) \
libTKG3d.so.7.7()(64bit) \
libTKGeomAlgo.so.7.7()(64bit) \
libTKGeomBase.so.7.7()(64bit) \
libTKHLR.so.7.7()(64bit) \
libTKLCAF.so.7.7()(64bit) \
libTKMath.so.7.7()(64bit) \
libTKMesh.so.7.7()(64bit) \
libTKPrim.so.7.7()(64bit) \
libTKService.so.7.7()(64bit) \
libTKShHealing.so.7.7()(64bit) \
libTKStd.so.7.7()(64bit) \
libTKStdL.so.7.7()(64bit) \
libTKTopAlgo.so.7.7()(64bit) \
libTKV3d.so.7.7()(64bit) \
libTKVCAF.so.7.7()(64bit) \
libTKXml.so.7.7()(64bit) \
libTKXmlL.so.7.7()(64bit) \
libTKXmlTObj.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
