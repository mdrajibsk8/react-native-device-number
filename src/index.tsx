import { NativeModules } from 'react-native';

// const LINKING_ERROR =
//   `The package 'react-native-device-number' doesn't seem to be linked. Make sure: \n\n` +
//   Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
//   '- You rebuilt the app after installing the package\n' +
//   '- You are not using Expo managed workflow\n';

// const DeviceNumber = NativeModules.DeviceNumber
//   ? NativeModules.DeviceNumber
//   : new Proxy(
//       {},
//       {
//         get() {
//           throw new Error(LINKING_ERROR);
//         },
//       }
//     );

// export function multiply(a: number, b: number): Promise<number> {
//   return DeviceNumber.multiply(a, b);
// }


const { DeviceNumber } = NativeModules;

export default DeviceNumber;