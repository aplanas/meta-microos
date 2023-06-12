SUMMARY = "Toolkit for scientific image processing, segmentation, and registration"
DESCRIPTION = "The Insight Toolkit (ITK) is a toolkit for N-dimensional scientific \
image processing, segmentation, and registration. \
 \
This package provides shared libraries for ITK."
LICENSE = "Apache-2.0"

PV = "5.3.0"

RPM_NAME = "libinsighttoolkit5_3-1-5.3.0-3.2.aarch64.rpm"
RPM_HASH = "52854cd57e02b93183506627e09df64db07ee9eb649d7dfe33557e7f1b8558fa8c3f39c8e2b1289bb85ae0d3222ad747e88b7f046328c468e6aa787cadabdbb8"

RPROVIDES:${PN} += "libITKBiasCorrection-5.3.so.1()(64bit) \
libITKColormap-5.3.so.1()(64bit) \
libITKCommon-5.3.so.1()(64bit) \
libITKConvolution-5.3.so.1()(64bit) \
libITKDICOMParser-5.3.so.1()(64bit) \
libITKDeformableMesh-5.3.so.1()(64bit) \
libITKDenoising-5.3.so.1()(64bit) \
libITKDiffusionTensorImage-5.3.so.1()(64bit) \
libITKFFT-5.3.so.1()(64bit) \
libITKFastMarching-5.3.so.1()(64bit) \
libITKIOBMP-5.3.so.1()(64bit) \
libITKIOBioRad-5.3.so.1()(64bit) \
libITKIOBruker-5.3.so.1()(64bit) \
libITKIOCSV-5.3.so.1()(64bit) \
libITKIOGDCM-5.3.so.1()(64bit) \
libITKIOGE-5.3.so.1()(64bit) \
libITKIOGIPL-5.3.so.1()(64bit) \
libITKIOHDF5-5.3.so.1()(64bit) \
libITKIOIPL-5.3.so.1()(64bit) \
libITKIOImageBase-5.3.so.1()(64bit) \
libITKIOJPEG-5.3.so.1()(64bit) \
libITKIOJPEG2000-5.3.so.1()(64bit) \
libITKIOLSM-5.3.so.1()(64bit) \
libITKIOMINC-5.3.so.1()(64bit) \
libITKIOMRC-5.3.so.1()(64bit) \
libITKIOMeshBYU-5.3.so.1()(64bit) \
libITKIOMeshBase-5.3.so.1()(64bit) \
libITKIOMeshFreeSurfer-5.3.so.1()(64bit) \
libITKIOMeshGifti-5.3.so.1()(64bit) \
libITKIOMeshOBJ-5.3.so.1()(64bit) \
libITKIOMeshOFF-5.3.so.1()(64bit) \
libITKIOMeshVTK-5.3.so.1()(64bit) \
libITKIOMeta-5.3.so.1()(64bit) \
libITKIONIFTI-5.3.so.1()(64bit) \
libITKIONRRD-5.3.so.1()(64bit) \
libITKIOPNG-5.3.so.1()(64bit) \
libITKIOSiemens-5.3.so.1()(64bit) \
libITKIOSpatialObjects-5.3.so.1()(64bit) \
libITKIOStimulate-5.3.so.1()(64bit) \
libITKIOTIFF-5.3.so.1()(64bit) \
libITKIOTransformBase-5.3.so.1()(64bit) \
libITKIOTransformHDF5-5.3.so.1()(64bit) \
libITKIOTransformInsightLegacy-5.3.so.1()(64bit) \
libITKIOTransformMatlab-5.3.so.1()(64bit) \
libITKIOVTK-5.3.so.1()(64bit) \
libITKIOXML-5.3.so.1()(64bit) \
libITKImageFeature-5.3.so.1()(64bit) \
libITKImageIntensity-5.3.so.1()(64bit) \
libITKKLMRegionGrowing-5.3.so.1()(64bit) \
libITKLabelMap-5.3.so.1()(64bit) \
libITKMarkovRandomFieldsClassifiers-5.3.so.1()(64bit) \
libITKMathematicalMorphology-5.3.so.1()(64bit) \
libITKMesh-5.3.so.1()(64bit) \
libITKMetaIO-5.3.so.1()(64bit) \
libITKNrrdIO-5.3.so.1()(64bit) \
libITKOptimizers-5.3.so.1()(64bit) \
libITKOptimizersv4-5.3.so.1()(64bit) \
libITKPDEDeformableRegistration-5.3.so.1()(64bit) \
libITKPath-5.3.so.1()(64bit) \
libITKPolynomials-5.3.so.1()(64bit) \
libITKQuadEdgeMesh-5.3.so.1()(64bit) \
libITKQuadEdgeMeshFiltering-5.3.so.1()(64bit) \
libITKRegionGrowing-5.3.so.1()(64bit) \
libITKRegistrationMethodsv4-5.3.so.1()(64bit) \
libITKSmoothing-5.3.so.1()(64bit) \
libITKSpatialObjects-5.3.so.1()(64bit) \
libITKStatistics-5.3.so.1()(64bit) \
libITKTestKernel-5.3.so.1()(64bit) \
libITKTransform-5.3.so.1()(64bit) \
libITKTransformFactory-5.3.so.1()(64bit) \
libITKVNLInstantiation-5.3.so.1()(64bit) \
libITKVTK-5.3.so.1()(64bit) \
libITKVideoCore-5.3.so.1()(64bit) \
libITKVideoIO-5.3.so.1()(64bit) \
libITKWatersheds-5.3.so.1()(64bit) \
libITKgiftiio-5.3.so.1()(64bit) \
libITKniftiio-5.3.so.1()(64bit) \
libITKznz-5.3.so.1()(64bit) \
libinsighttoolkit5_3-1 \
libinsighttoolkit5_3-1(aarch-64) \
libitkNetlibSlatec-5.3.so.1()(64bit) \
libitkdouble-conversion-5.3.so.1()(64bit) \
libitklbfgs-5.3.so.1()(64bit) \
libitkminc2-5.3.so.1()(64bit) \
libitkopenjpeg-5.3.so.1()(64bit) \
libitksys-5.3.so.1()(64bit) \
libitktestlib-5.3.so.1()(64bit) \
libitkv3p_netlib-5.3.so.1()(64bit) \
libitkvcl-5.3.so.1()(64bit) \
libitkvnl-5.3.so.1()(64bit) \
libitkvnl_algo-5.3.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexpat.so.1()(64bit) \
libfftw3.so.3()(64bit) \
libfftw3_threads.so.3()(64bit) \
libfftw3f.so.3()(64bit) \
libfftw3f_threads.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libgdcmDICT.so.3.0()(64bit) \
libgdcmDSED.so.3.0()(64bit) \
libgdcmMSFF.so.3.0()(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_cpp.so.200()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libtiff.so.6(LIBTIFF_4.1)(64bit) \
libz.so.1()(64bit)"

inherit rpm
